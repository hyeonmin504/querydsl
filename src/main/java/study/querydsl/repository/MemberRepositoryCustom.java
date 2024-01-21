package study.querydsl.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import study.querydsl.dto.MemberSearchCndition;
import study.querydsl.dto.MemberTeamDto;
import study.querydsl.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    List<MemberTeamDto> search(MemberSearchCndition condition);
    Page<MemberTeamDto> searchPageSimple(MemberSearchCndition condition, Pageable pageable);
    Page<MemberTeamDto> searchPageComplex(MemberSearchCndition condition, Pageable pageable);
}
