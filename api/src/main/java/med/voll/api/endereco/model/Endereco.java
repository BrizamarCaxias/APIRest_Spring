package med.voll.api.endereco.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.DadosEndereco;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

	private String logradouro;
	private String bairro;
	private String cep;
	private String numero;
	private String complemento;
	private String uf;
	private String cidade;


	public Endereco(DadosEndereco dados) {

		this.logradouro = dados.logradouro();
		this.bairro = dados.bairro();
		this.cep = dados.cep();
		this.numero = dados.numero();
		this.complemento = dados.complemento();
		this.uf = dados.uf();
		this.cidade = dados.cidade();

	}

}
