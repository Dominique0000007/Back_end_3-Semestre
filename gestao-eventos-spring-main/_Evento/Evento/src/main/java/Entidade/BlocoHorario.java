package Entidade;

	import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

	@Entity
	public class BlocoHorario {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private LocalDateTime inicio;
	    private LocalDateTime fim;

	    @ManyToOne
	    @JoinColumn(name = "atividade_id")
	    private Atividade atividade;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public LocalDateTime getInicio() {
			return inicio;
		}

		public void setInicio(LocalDateTime inicio) {
			this.inicio = inicio;
		}

		public LocalDateTime getFim() {
			return fim;
		}

		public void setFim(LocalDateTime fim) {
			this.fim = fim;
		}

		public Atividade getAtividade() {
			return atividade;
		}

		public void setAtividade(Atividade atividade) {
			this.atividade = atividade;
		}

}
