package com.example.demo.comentario;

import java.sql.Date;

import com.example.demo.mangaManhwa.MangaManhwa;
import com.example.demo.usuario.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Comentario {

    @Id
    @GeneratedValue (strategy =  GenerationType.AUTO)
    private long id;
    private String contenido;
    private Date fecha_comentario;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private MangaManhwa mangaManhwa;
}
