package com.uca.capas.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public",name="MOVIE")
public class Movie {
	@Id 
	@GeneratedValue(generator="movie_id_movie_seq",strategy= GenerationType.AUTO)
	@SequenceGenerator(name="movie_id_movie_seq",sequenceName= "public.movie_id_movie_seq",allocationSize=1)
    @Column(name="id_movie")
    private Integer IdMovie;
	
	@Column(name="name")
    private String Name;
	
	@Column(name="length")
    private Integer length;

	@Column(name="status")
    private boolean Status;
	
	@Column(name="image")
    private String image;
	
	@Column(name="video")
    private String video;
	
	@OneToMany(mappedBy="Movie",fetch= FetchType.LAZY,orphanRemoval=true,cascade=CascadeType.PERSIST)
	private List<Showcase> Showcase;

	public Integer getIdMovie() {
		return IdMovie;
	}

	public void setIdMovie(Integer idMovie) {
		IdMovie = idMovie;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public List<Showcase> getShowcase() {
		return Showcase;
	}

	public void setShowcase(List<Showcase> showcase) {
		Showcase = showcase;
	}
	
	
}
