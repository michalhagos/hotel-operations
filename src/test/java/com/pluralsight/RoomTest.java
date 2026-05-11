package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_markRoomOccupied() {
        // arrange
        Room room = new Room(2, 149.00, false, false);
        // act
        room.checkIn();
        // assert
        assertTrue(room.isOccupied());
    }



























}