package UI.Table;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    private final Table table = new Table();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void main() {
        assertEquals(2,table.main());
    }
}