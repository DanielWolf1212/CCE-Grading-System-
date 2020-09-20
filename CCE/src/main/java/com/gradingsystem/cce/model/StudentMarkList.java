package com.gradingsystem.cce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studentmarklist")
public class StudentMarkList {
	
		@Id
		private String sid;
		@Column(name="standard")
		private String standard;
		@Column(name="section")
		private String section;
		@Column(name="term")
		private String term;
		
		@Column(name = "tamilsa")
		private String tamilsa;
		@Column(name = "tamilfa")
		private String tamilfa;
		@Column(name = "tamiltotal")
		private String tamiltotal;
		@Column(name = "tamilsag")
		private String tamilsag;
		@Column(name = "tamilfag")
		private String tamilfag;
		@Column(name = "tamilttg")
		private String tamilttg;
		
		@Column(name = "englishsa")
		private String englishsa;
		@Column(name = "englishfa")
		private String englishfa;
		@Column(name = "englishtotal")
		private String englishtotal;
		@Column(name = "englishsag")
		private String englishsag;
		@Column(name = "englishfag")
		private String englishfag;
		@Column(name = "englishttg")
		private String englishttg;
		
		@Column(name = "mathssa")
		private String mathssa;
		@Column(name = "mathsfa")
		private String mathsfa;
		@Column(name = "mathstotal")
		private String mathstotal;
		@Column(name = "mathssag")
		private String mathssag;
		@Column(name = "mathsfag")
		private String mathsfag;
		@Column(name = "mathsttg")
		private String mathsttg;
		
		
		@Column(name = "sciencesa")
		private String sciencesa;
		@Column(name = "sciencefa")
		private String sciencefa;
		@Column(name = "sciencetotal")
		private String sciencetotal;
		@Column(name = "sciencesag")
		private String sciencesag;
		@Column(name = "sciencefag")
		private String sciencefag;
		@Column(name = "sciencettg")
		private String sciencettg;
		
		
		@Column(name = "socialsa")
		private String socialsa;
		@Column(name = "socialfa")
		private String socialfa;
		@Column(name = "socialtotal")
		private String socialtotal;
		@Column(name = "socialsag")
		private String socialsag;
		@Column(name = "socialfag")
		private String socialfag;
		@Column(name = "socialttg")
		private String socialttg;
		
//		@OneToOne
//		@Column(name = "sid")
//		private Student stu;
		
		
		
//		public Student getStu() {
//			return stu;
//		}
//		public void setStu(Student stu) {
//			this.stu = stu;
//		}
		public String getSid() {
			return sid;
		}
		public void setSid(String sid) {
			this.sid = sid;
		}
		public String getTamilsa() {
			return tamilsa;
		}
		public void setTamilsa(String tamilsa) {
			this.tamilsa = tamilsa;
		}
		public String getTamilfa() {
			return tamilfa;
		}
		public void setTamilfa(String tamilfa) {
			this.tamilfa = tamilfa;
		}
		public String getTamiltotal() {
			return tamiltotal;
		}
		public void setTamiltotal(String tamiltotal) {
			this.tamiltotal = tamiltotal;
		}
		public String getTamilsag() {
			return tamilsag;
		}
		public void setTamilsag(String tamilsag) {
			this.tamilsag = tamilsag;
		}
		public String getTamilfag() {
			return tamilfag;
		}
		public void setTamilfag(String tamilfag) {
			this.tamilfag = tamilfag;
		}
		public String getTamilttg() {
			return tamilttg;
		}
		public void setTamilttg(String tamilttg) {
			this.tamilttg = tamilttg;
		}
		public String getEnglishsa() {
			return englishsa;
		}
		public void setEnglishsa(String englishsa) {
			this.englishsa = englishsa;
		}
		public String getEnglishfa() {
			return englishfa;
		}
		public void setEnglishfa(String englishfa) {
			this.englishfa = englishfa;
		}
		public String getEnglishtotal() {
			return englishtotal;
		}
		public void setEnglishtotal(String englishtotal) {
			this.englishtotal = englishtotal;
		}
		public String getEnglishsag() {
			return englishsag;
		}
		public void setEnglishsag(String englishsag) {
			this.englishsag = englishsag;
		}
		public String getEnglishfag() {
			return englishfag;
		}
		public void setEnglishfag(String englishfag) {
			this.englishfag = englishfag;
		}
		public String getEnglishttg() {
			return englishttg;
		}
		public void setEnglishttg(String englishttg) {
			this.englishttg = englishttg;
		}
		public String getMathssa() {
			return mathssa;
		}
		public void setMathssa(String mathssa) {
			this.mathssa = mathssa;
		}
		public String getMathsfa() {
			return mathsfa;
		}
		public void setMathsfa(String mathsfa) {
			this.mathsfa = mathsfa;
		}
		public String getMathstotal() {
			return mathstotal;
		}
		public void setMathstotal(String mathstotal) {
			this.mathstotal = mathstotal;
		}
		public String getMathssag() {
			return mathssag;
		}
		public void setMathssag(String mathssag) {
			this.mathssag = mathssag;
		}
		public String getMathsfag() {
			return mathsfag;
		}
		public void setMathsfag(String mathsfag) {
			this.mathsfag = mathsfag;
		}
		public String getMathsttg() {
			return mathsttg;
		}
		public void setMathsttg(String mathsttg) {
			this.mathsttg = mathsttg;
		}
		public String getSciencesa() {
			return sciencesa;
		}
		public void setSciencesa(String sciencesa) {
			this.sciencesa = sciencesa;
		}
		public String getSciencefa() {
			return sciencefa;
		}
		public void setSciencefa(String sciencefa) {
			this.sciencefa = sciencefa;
		}
		public String getSciencetotal() {
			return sciencetotal;
		}
		public void setSciencetotal(String sciencetotal) {
			this.sciencetotal = sciencetotal;
		}
		public String getSciencesag() {
			return sciencesag;
		}
		public void setSciencesag(String sciencesag) {
			this.sciencesag = sciencesag;
		}
		public String getSciencefag() {
			return sciencefag;
		}
		public void setSciencefag(String sciencefag) {
			this.sciencefag = sciencefag;
		}
		public String getSciencettg() {
			return sciencettg;
		}
		public void setSciencettg(String sciencettg) {
			this.sciencettg = sciencettg;
		}
		public String getSocialsa() {
			return socialsa;
		}
		public void setSocialsa(String socialsa) {
			this.socialsa = socialsa;
		}
		public String getSocialfa() {
			return socialfa;
		}
		public void setSocialfa(String socialfa) {
			this.socialfa = socialfa;
		}
		public String getSocialtotal() {
			return socialtotal;
		}
		public void setSocialtotal(String socialtotal) {
			this.socialtotal = socialtotal;
		}
		public String getSocialsag() {
			return socialsag;
		}
		public void setSocialsag(String socialsag) {
			this.socialsag = socialsag;
		}
		public String getSocialfag() {
			return socialfag;
		}
		public void setSocialfag(String socialfag) {
			this.socialfag = socialfag;
		}
		public String getSocialttg() {
			return socialttg;
		}
		public void setSocialttg(String socialttg) {
			this.socialttg = socialttg;
		}
		public String getTerm() {
			return term;
		}
		public void setTerm(String term) {
			this.term = term;
		}
		public String getStandard() {
			return standard;
		}
		public void setStandard(String standard) {
			this.standard = standard;
		}
		public String getSection() {
			return section;
		}
		public void setSection(String section) {
			this.section = section;
		}
	}
