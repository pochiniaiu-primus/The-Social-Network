package com.serhiihonchar.network.repo;

import com.serhiihonchar.network.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
