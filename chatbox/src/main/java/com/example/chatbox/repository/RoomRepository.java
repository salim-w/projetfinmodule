package com.example.chatbox.repository;



import com.example.chatbox.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByName(String name);
    List<Room> findByIsPrivate(boolean isPrivate);


}

