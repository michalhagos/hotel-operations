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

    @Test
    public void checkIn_should_markRoomDirty() {
        // arrange
        Room room = new Room(2, 149.00, false, false);
        // act
        room.checkIn();
        // assert
        assertTrue(room.isDirty());
    }

    @Test
    public void checkIn_should_makeRoomUnavailable() {
        // arrange
        Room room = new Room(2, 149.99, false, false);
        // act
        room.checkIn();
        // assert
        assertFalse(room.isAvailable());
    }

    @Test
    public void checkIn_should_stillBeOccupied_whenAlreadyOccupied() {
        // arrange
        Room room = new Room(2, 139.99, true, true);
        // act
        room.checkIn();
        // assert
        assertTrue(room.isOccupied());
    }
    @Test
    public void checkIn_should_stillBeDirty_whenRoomIsDirty() {
        // arrange
        Room room = new Room(2, 139.99, false, true);
        // act
        room.checkIn();
        // assert
        assertTrue(room.isDirty());
    }





















}