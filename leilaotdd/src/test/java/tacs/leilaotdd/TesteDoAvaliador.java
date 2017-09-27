package tacs.leilaotdd;

import org.junit.Assert;
import org.junit.Test;

import tacs.leilaotdd.dominio.Lance;
import tacs.leilaotdd.dominio.Leilao;
import tacs.leilaotdd.dominio.Usuario;
import tacs.leilaotdd.servico.Avaliador;

public class TesteDoAvaliador {

	@Test
	public void deveEntenderLanceEmOrdemCrescente(){
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("Paly 3 Novo");
		leilao.propoe(new Lance(joao, 300.0));
		leilao.propoe(new Lance(jose, 400.0));
		leilao.propoe(new Lance(maria, 250.0));

		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		double maiorEsperado = 400;
		double menorEsperado = 250;
		Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
		
	}
	
}
