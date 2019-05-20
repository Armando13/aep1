package CadastroDePessoas;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Juridica extends Pessoa {
	
	private String cnpj;
	private double capitalSocial;
	private Set<CotaSociedade> cotasSociedade = new HashSet<CotaSociedade>();
	
	public Juridica(String nome, String cnpj, double capitalSocial) {
		super(nome);
		this.capitalSocial = capitalSocial;
		this.cnpj = cnpj;
	}
	
	public Juridica(UUID id, String nome, String cnpj, double capitalSocial) {
		super(id, nome);
		this.capitalSocial = capitalSocial;
		this.cnpj = cnpj;
	}
	
	public double getCapitalSocial() {
		return capitalSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	
	public void adicionarSocio(Pessoa socio, double percentualDeParticipacao) {
		
		if (socio.id != this.id) {
			
			cotasSociedade.add(new CotaSociedade(socio, percentualDeParticipacao));
		} else {
			
			System.out.println("não pode ser sócio de si mesmo!");
		}
	}
	
	public void removerSocio(Pessoa socio) {
		
		boolean verificacao = false;
		for (CotaSociedade cota : cotasSociedade) {
			
			if(cota.socio == socio) {
				
				cotasSociedade.remove(cota);
				verificacao = true;
			}		
		}
		
		if (!verificacao) {
			
			System.out.println(socio.getNome() + " não é sócio");
		}
		
	}
	
	
	private class CotaSociedade{
		
		private double percentualDeParticipacao;
		private Pessoa socio;
		
		public CotaSociedade(Pessoa socio, double percentualDEPArticipacao) {
			
			this.percentualDeParticipacao = percentualDEPArticipacao;
			this.socio = socio;
		}
	}
}