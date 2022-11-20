import com.tictactoe.game.model.Board;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void threeByThreeBoardIsCreated() {
        // Given
        Board board = new Board();

        // When
        List<String> boardPoints = board.getBoard().stream().map(p -> p.value).collect(Collectors.toList());

        // Then
        assertEquals(9, boardPoints.size());
        assertTrue(boardPoints.stream().allMatch("-"::equals));
    }

    @Test
    void threeByFourBoardIsCreated() {
        // Given
        Board board = new Board();

        // When
        board.addRow();
        List<String> boardPoints = board.getBoard().stream().map(p -> p.value).collect(Collectors.toList());

        // Then
        assertEquals(12, boardPoints.size());
        assertTrue(boardPoints.stream().allMatch("-"::equals));
    }

    @Test
    void fourByFourBoardIsCreated() {
        // Given
        Board board = new Board();

        // When
        board.addRow();
        board.addColumn();
        List<String> boardPoints = board.getBoard().stream().map(p -> p.value).collect(Collectors.toList());

        // Then
        assertEquals(16, boardPoints.size());
        assertTrue(boardPoints.stream().allMatch("-"::equals));
    }

    @Test
    void wrongPositionSelectedFromBoard() {
        // Given
        Board board = new Board();

        // Then
        assertThrows(NoSuchElementException.class, () -> board.getPointValue(4, 4));
    }

    @Test
    void boardCanHaveValuesAssigned() {
        // Given
        Board board = new Board();

        // When
        board.setPointValue(0, 0, "X");
        board.setPointValue(0, 1, "O");
        board.setPointValue(1, 2, "X");

        // Then
        assertEquals(board.getPointValue(0, 0), "X");
        assertEquals(board.getPointValue(0, 1), "O");
        assertEquals(board.getPointValue(1, 2), "X");
    }

}