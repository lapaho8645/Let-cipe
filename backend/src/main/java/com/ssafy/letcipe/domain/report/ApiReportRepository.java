package com.ssafy.letcipe.domain.report;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiReportRepository extends JpaRepository<ApiReport,Long> {
}
