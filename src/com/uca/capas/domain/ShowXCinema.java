package com.uca.capas.domain;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public",name="SHOWXCINEMA")
public class ShowXCinema {
	
	@Id 
	@GeneratedValue(generator="showxcinema_id_showxcinema_seq",strategy= GenerationType.AUTO)
	@SequenceGenerator(name="showxcinema_id_showxcinema_seq",sequenceName= "public.showxcinema_id_showxcinema_seq",allocationSize=1)
    @Column(name="id_showxcinema")
    private Integer IdSXC;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_showcase")
	private Showcase Show;
	
	@Column(name="availableSeats")
    private BigInteger ASeats;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="id_cinema")
	private Showcase Cinema;

	public Integer getIdSXC() {
		return IdSXC;
	}

	public void setIdSXC(Integer idSXC) {
		IdSXC = idSXC;
	}

	public Showcase getShow() {
		return Show;
	}

	public void setShow(Showcase show) {
		Show = show;
	}

	public BigInteger getASeats() {
		return ASeats;
	}

	public void setASeats(BigInteger aSeats) {
		ASeats = aSeats;
	}

	public Showcase getCinema() {
		return Cinema;
	}

	public void setCinema(Showcase cinema) {
		Cinema = cinema;
	}
	
	

}
