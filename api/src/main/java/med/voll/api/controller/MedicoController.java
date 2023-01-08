package med.voll.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.DadosListagemMedico;
import med.voll.api.medico.model.Medico;
import med.voll.api.medico.repository.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	@Autowired
	private MedicoRepository medicorepository;

	@PostMapping
	public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {

		medicorepository.save(new Medico(dados));

	}
	
	@GetMapping
	public Page<DadosListagemMedico> listar(Pageable pageable) {
		
		return medicorepository.findAll(pageable).map(DadosListagemMedico:: new);
		
	}

}
