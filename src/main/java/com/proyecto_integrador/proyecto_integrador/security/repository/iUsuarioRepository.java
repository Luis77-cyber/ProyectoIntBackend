package com.proyecto_integrador.proyecto_integrador.security.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto_integrador.proyecto_integrador.security.entity.User;


@Repository
public interface iUsuarioRepository extends JpaRepository<User,Integer> {
	Optional<User> findByNombreUsuario(String nombreUsuario);

	boolean existsByNombreUsuario(String nombreUsuario);
	boolean existsByEmail(String email);
}
