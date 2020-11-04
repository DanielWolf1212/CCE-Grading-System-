package com.gradingsystem.cce.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.gradingsystem.cce.model.StudentMarkList;

public interface StudentMarkListRepository extends JpaRepository<StudentMarkList, String> {

//	@Query("select s from StudentMarkList s where s.sid=?1 and s.term in ('term1','term2','term3') ")
	@Query("select s from StudentMarkList s where s.sid=?1 and s.term=?2 ")
	List<StudentMarkList> getGradeById(String sid, String term);

	@Transactional
	@Modifying
	@Query("update StudentMarkList s set s.tamilfa=?1 , s.tamilsa=?2 , s.tamiltotal=?3 , s.tamilfag=?4 , s.tamilsag=?5 , s.tamilttg=?6 ,"
			+ "s.englishfa=?7 , s.englishsa=?8 , s.englishtotal=?9 , s.englishfag=?10 , s.englishsag=?11 , s.englishttg=?12 ,"
			+ "s.mathsfa=?13 , s.mathssa=?14 , s.mathstotal=?15 , s.mathsfag=?16 , s.mathssag=?17 , s.mathsttg=?18 ,"
			+ "s.sciencefa=?19 , s.sciencesa=?20 , s.sciencetotal=?21 , s.sciencefag=?22 , s.sciencesag=?23 , s.sciencettg=?24 ,"
			+ "s.socialfa=?25 , s.socialsa=?26 , s.socialtotal=?27 , s.socialfag=?28 , s.socialsag=?29 , s.socialttg=?30 where s.sid=?31 and s.term=?32")
	int updateGrade(String tamilfa, String tamilsa, String tamiltotal, String tamilfag, String tamilsag,
			String tamilttg, String englishfa, String englishsa, String englishtotal, String englishfag,
			String englishsag, String englishttg, String mathsfa, String mathssa, String mathstotal, String mathsfag,
			String mathssag, String mathsttg, String sciencefa, String sciencesa, String sciencetotal,
			String sciencefag, String sciencesag, String sciencettg, String socialfa, String socialsa,
			String socialtotal, String socialfag, String socialsag, String socialttg, String sid, String term);

	@Query("select s from StudentMarkList s where sid=?1 and term=?2")
	List<StudentMarkList> getDuplicate(String sid, String term);
}
