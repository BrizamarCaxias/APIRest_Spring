package med.voll.api.medico;

import med.voll.api.medico.model.Medico;

public record DadosListagemMedico(String nome, String email, Especialidade especialidade, String crm) {
	
	public DadosListagemMedico(Medico medico) {
		this(medico.getNome(), medico.getEmail(),medico.getEspecialidade(),medico.getCrm());
	}



}
