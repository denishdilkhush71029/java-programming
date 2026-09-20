import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LudoGUI extends JFrame {

    public LudoGUI() {
        setTitle("Java Swing Ludo Game");
        setSize(650, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        LudoBoardPanel boardPanel = new LudoBoardPanel();
        add(boardPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LudoGUI().setVisible(true);
        });
    }
}

class LudoBoardPanel extends JPanel {
    private final int GRID_SIZE = 15;
    private int cellSize;
    
    // Dice State
    private int diceValue = 1;
    private final JButton rollButton;
    private final JLabel diceLabel;
    private final Random random = new Random();

    // Tokens Position (Track Index: 0 to 51)
    private int redTokenTrackPos = 0;  // Red Token Example Position
    private int greenTokenTrackPos = 13; // Green Token Example Position

    // 52 Common Track Cells mapping: {Row, Col} in 15x15 Grid
    private final int[][] mainTrackGrid = {
        {6, 1}, {6, 2}, {6, 3}, {6, 4}, {6, 5},                // Red Approach
        {5, 6}, {4, 6}, {3, 6}, {2, 6}, {1, 6}, {0, 6},        // Up
        {0, 7}, {0, 8},                                        // Top Transition
        {1, 8}, {2, 8}, {3, 8}, {4, 8}, {5, 8},                // Down
        {6, 9}, {6, 10}, {6, 11}, {6, 12}, {6, 13}, {6, 14},   // Right
        {7, 14}, {8, 14},                                      // Right Transition
        {8, 13}, {8, 12}, {8, 11}, {8, 10}, {8, 9},            // Left
        {9, 8}, {10, 8}, {11, 8}, {12, 8}, {13, 8}, {14, 8},   // Down
        {14, 7}, {14, 6},                                      // Bottom Transition
        {13, 6}, {12, 6}, {11, 6}, {10, 6}, {9, 6},            // Up
        {8, 5}, {8, 4}, {8, 3}, {8, 2}, {8, 1}, {8, 0},        // Left
        {7, 0}, {6, 0}                                         // Left Transition
    };

    public LudoBoardPanel() {
        setLayout(null);

        // Dice Roll UI Controls
        diceLabel = new JLabel("Dice: 1", SwingConstants.CENTER);
        diceLabel.setFont(new Font("Arial", Font.BOLD, 18));
        diceLabel.setBounds(200, 615, 100, 40);
        add(diceLabel);

        // Keep the source file compatible with Java compilers using non-UTF-8 encoding.
        rollButton = new JButton("Roll Dice");
        rollButton.setFont(new Font("Arial", Font.BOLD, 14));
        rollButton.setBounds(310, 615, 130, 40);
        add(rollButton);

        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                diceValue = random.nextInt(6) + 1;
                diceLabel.setText("Dice: " + diceValue);

                // Move Red Token according to Dice Roll
                redTokenTrackPos = (redTokenTrackPos + diceValue) % 52;
                repaint(); // Redraw UI with updated coordinates
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int boardWidth = Math.min(getWidth(), getHeight() - 100);
        cellSize = boardWidth / GRID_SIZE;

        // 1. Draw Grid Background
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, cellSize * GRID_SIZE, cellSize * GRID_SIZE);

        // 2. Draw 4 Home Bases (6x6 Areas)
        drawBase(g2, 0, 0, Color.RED, "RED");
        drawBase(g2, 9, 0, Color.GREEN, "GREEN");
        drawBase(g2, 0, 9, Color.BLUE, "BLUE");
        drawBase(g2, 9, 9, Color.YELLOW, "YELLOW");

        // 3. Draw Home Paths (Colored Stretches)
        for (int i = 1; i <= 5; i++) {
            fillCell(g2, 7, i, Color.RED);          // Red Home Stretch
            fillCell(g2, i, 7, Color.BLUE);         // Blue Home Stretch
            fillCell(g2, 7, 14 - i, Color.YELLOW);   // Yellow Home Stretch
            fillCell(g2, 14 - i, 7, Color.GREEN);   // Green Home Stretch
        }

        // 4. Starting Cell Highlights
        fillCell(g2, 6, 1, Color.RED);
        fillCell(g2, 1, 8, Color.BLUE);
        fillCell(g2, 8, 13, Color.YELLOW);
        fillCell(g2, 13, 6, Color.GREEN);

        // 5. Draw Center Triangle (Home Goal)
        int centerStart = 6 * cellSize;
        int centerSize = 3 * cellSize;
        g2.setColor(Color.BLACK);
        g2.drawRect(centerStart, centerStart, centerSize, centerSize);
        
        Polygon pRed = new Polygon(new int[]{centerStart, centerStart + centerSize / 2, centerStart}, new int[]{centerStart, centerStart + centerSize / 2, centerStart + centerSize}, 3);
        g2.setColor(Color.RED); g2.fill(pRed);

        Polygon pBlue = new Polygon(new int[]{centerStart, centerStart + centerSize / 2, centerStart + centerSize}, new int[]{centerStart, centerStart + centerSize / 2, centerStart}, 3);
        g2.setColor(Color.BLUE); g2.fill(pBlue);

        Polygon pYellow = new Polygon(new int[]{centerStart + centerSize, centerStart + centerSize / 2, centerStart + centerSize}, new int[]{centerStart, centerStart + centerSize / 2, centerStart + centerSize}, 3);
        g2.setColor(Color.YELLOW); g2.fill(pYellow);

        Polygon pGreen = new Polygon(new int[]{centerStart, centerStart + centerSize / 2, centerStart + centerSize}, new int[]{centerStart + centerSize, centerStart + centerSize / 2, centerStart + centerSize}, 3);
        g2.setColor(Color.GREEN); g2.fill(pGreen);

        // 6. Draw Grid Lines
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(1.5f));
        for (int i = 0; i <= GRID_SIZE; i++) {
            g2.drawLine(i * cellSize, 0, i * cellSize, GRID_SIZE * cellSize);
            g2.drawLine(0, i * cellSize, GRID_SIZE * cellSize, i * cellSize);
        }

        // 7. Render Tokens at mapped coordinates
        drawToken(g2, redTokenTrackPos, Color.RED);
        drawToken(g2, greenTokenTrackPos, Color.GREEN);
    }

    private void drawBase(Graphics2D g2, int row, int col, Color color, String name) {
        g2.setColor(color);
        g2.fillRect(col * cellSize, row * cellSize, 6 * cellSize, 6 * cellSize);
        g2.setColor(Color.WHITE);
        g2.fillRect((col + 1) * cellSize, (row + 1) * cellSize, 4 * cellSize, 4 * cellSize);
    }

    private void fillCell(Graphics2D g2, int row, int col, Color color) {
        g2.setColor(color);
        g2.fillRect(col * cellSize, row * cellSize, cellSize, cellSize);
    }

    // Coordinate Mapping Execution: Index -> Screen Pixel (X, Y)
    private void drawToken(Graphics2D g2, int trackIndex, Color color) {
        int row = mainTrackGrid[trackIndex][0];
        int col = mainTrackGrid[trackIndex][1];

        // Screen Pixel Calculations
        int x = col * cellSize + cellSize / 6;
        int y = row * cellSize + cellSize / 6;
        int tokenDiameter = (int) (cellSize * 0.65);

        // Drawing Token Outer Circle & Inner Border
        g2.setColor(color);
        g2.fillOval(x, y, tokenDiameter, tokenDiameter);
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(2));
        g2.drawOval(x, y, tokenDiameter, tokenDiameter);
    }
}