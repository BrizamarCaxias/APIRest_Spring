package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.model.Medico;
import med.voll.api.medico.repository.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	@Autowired
	private MedicoRepository medicorepository;

	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroMedico dados) {

		medicorepository.save(new Medico(dados));

	}

}
