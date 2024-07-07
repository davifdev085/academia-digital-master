package me.dio.academia.digital.entity;

// Anotações para controle de serialização
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Anotações do Lombok para evitar código boilerplate
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Anotações JPA para mapeamento da entidade
import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_alunos")

// Ignora propriedades específicas ao trabalhar com objetos carregados parcialmente com JPA/Hibernate
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {

  // Anotação @Id este campo é a chave primária da entidade
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  @Column(unique = true)
  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

  // Relacionamento One-to-Many com a entidade AvaliacaoFisica
  // Mapeado pelo campo "aluno" na entidade AvaliacaoFisica
  @OneToMany(mappedBy = "aluno", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)

  // Ignora a lista de avaliações na serialização JSON para evitar recursão infinita ou sobrecarga de dados
  @JsonIgnore
  private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
}
