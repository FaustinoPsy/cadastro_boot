package br.senai.sp.informatica.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
public class Usuario {
	@Id
	@Column(name="username")
	@Size(min=3, max=150, message="O nome deve ter no minimo 3 caracteres e no m�ximo 150 caracteres")
	private String nome;
	@Column(name="password")
	private String senha;
	@Column(name="enabled")
	private boolean habilitado;
	public Usuario orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}
