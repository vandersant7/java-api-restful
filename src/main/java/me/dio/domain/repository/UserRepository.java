package me.dio.domain.repository;

import me.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Interface UserRepository que atua como um repositório para a entidade User.
 *
 * <p>Essa interface herda de JpaRepository, que fornece uma série de métodos prontos para
 * operações de acesso a dados, como salvar, atualizar, deletar e buscar registros.</p>
 *
 * <p>O JpaRepository aceita dois parâmetros genéricos:
 * 1. O primeiro parâmetro é a entidade que estamos manipulando, neste caso a classe User.
 * 2. O segundo parâmetro é o tipo do identificador da entidade, que no nosso caso é um Long.</p>
 */
@Repository // Indica que esta interface é um componente de acesso a dados, permitindo a injeção de dependência pelo Spring
public interface UserRepository extends JpaRepository<User, Long> {
    // Métodos adicionais de consulta podem ser definidos aqui, se necessário.
}