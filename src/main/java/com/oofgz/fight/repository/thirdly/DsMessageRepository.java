package com.oofgz.fight.repository.thirdly;

import com.oofgz.fight.domain.thirdly.DsMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DsMessageRepository extends JpaRepository<DsMessage, Long> {
}