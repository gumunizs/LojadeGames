package br.org.generation.lojagames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.lojagames.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);
//optional - pq ele pode retornar nulo, <devolve o usuario> procura o usuario.
}