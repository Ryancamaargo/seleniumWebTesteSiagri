package siagri;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class siagri01a06 {
	String caminhoExe = "C:/Users/ryanc/OneDrive/Documentos/geckodriver.exe";
	
	@Test
	public void ct01e02() {
		System.setProperty("webdriver.gecko.driver", caminhoExe);
		WebDriver driver = new FirefoxDriver();
	
	
		//ct01
		driver.get("https://www.siagri.com.br");
		driver.findElement(By.xpath("//a[contains(text(),'Solu��es')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		
		
		
		driver.findElement(By.xpath("//span[contains(.,'Distribuidor de insumos')]")).click();
		
		
		
		
		driver.findElement(By.xpath("//span[contains(.,'Loja agropecu�ria')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Solu��es')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		
		driver.findElement(By.xpath("//span[contains(.,'Armaz�ns gerais')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Solu��es')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		
		driver.findElement(By.xpath("//span[contains(.,'Produtor agr�cola')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Solu��es')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		
		driver.findElement(By.xpath("//span[contains(.,'Sementeira')]")).click();


		driver.findElement(By.xpath("//a[contains(text(),'Solu��es')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		
		driver.findElement(By.xpath("//span[contains(.,'Outros')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Solu��es')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
				
		//ct02.0
		driver.getCurrentUrl().equals("https://www.siagri.com.br/segmentos/distribuidor-insumos");
		
		//ct02.1
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div")).equals("Softwares para gest�o de distribuidores e revendas de insumos agr�colas");
		
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/p")).equals("Otimize processos, reduza desperd�cios e tenha o controle de suas lojas em qualquer hora e lugar. Com o Grupo Siagri, voc� compra melhor, evita perdas no estoque, vende com mais efici�ncia e ainda tem mais seguran�a nas opera��es de Barter!");
		
		
		driver.findElement(By.cssSelector(".form-open:nth-child(3)")).click();
		
		
		//ct02.2
		driver.findElement(By.id("form-close")).click();
		
		driver.findElement(By.xpath("//span[contains(.,'Estoque eficiente')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Forma��o de pre�os')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Gest�o de log�stica (expedi��o)')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Ampliar mix de atividades (armazenagem, Barter etc)')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Gest�o or�ament�ria')]")).isEnabled();
		
		driver.close();
	
		//Testado e ok
	}
	
	@Test
	public void ct03e04() {
		System.setProperty("webdriver.gecko.driver", caminhoExe);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.siagri.com.br");
		driver.findElement(By.xpath("//a[contains(text(),'Solu��es')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		driver.findElement(By.xpath("//span[contains(.,'Loja agropecu�ria')]")).click();
		
		//ct03.0
		driver.getCurrentUrl().equals("https://www.siagri.com.br/segmentos/loja-agropecuaria");
		
		//ct03.1
		
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div")).equals("Softwares para gest�o de lojas e varejo agropecu�rio");
		
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/h2")).equals("A descri��o � igual � �Ganhe agilidade em vendas, confian�a nos controles de estoque e custos. Fidelize seu cliente e gerencie sua loja agropecu�ria de forma completa com o software Siagri.");
	
		driver.findElement(By.cssSelector(".form-open:nth-child(5)")).click();
		
		driver.findElement(By.id("form-close")).click();
		

		
		//ct03.2

		driver.findElement(By.xpath("//span[contains(.,'Agilidade no atendimento')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Efici�ncia operacional')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de comissionamento')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Conformidade fiscal')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Efici�ncia no fluxo de caixa em dia')]")).isEnabled();
		
		//ct04
		
		driver.findElement(By.xpath("//a[contains(text(),'Solu��es')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		driver.findElement(By.xpath("//span[contains(.,'Armaz�ns gerais')]")).click();
		
		//ct04.0
		driver.getCurrentUrl().equals("https://www.siagri.com.br/segmentos/armazens-gerais");
		
		//ct04.1
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div")).equals("Softwares para gest�o de armaz�ns gerais e cerealistas");
		
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/h2")).equals("Ganhe efici�ncia desde o recebimento at� a expedi��o dos gr�os. Com o Grupo Siagri, voc� gerencia todos os processos de armazenagem de gr�os com agilidade e seguran�a.");
	
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/span")).click();
		
		driver.findElement(By.id("form-close")).click();
		
	
		
		//ct04.2
		driver.findElement(By.xpath("//span[contains(.,'Gest�o de contratos')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de saldos de terceiros')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de reten��es e transgenia')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'An�lise de exposi��o')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de servi�os prestados')]")).isEnabled();
		driver.close();
		
		//Testado e ok
	}
	
	@Test
	public void ct05e06() {
		System.setProperty("webdriver.gecko.driver", caminhoExe);
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.siagri.com.br/segmentos");
		driver.findElement(By.xpath("//a[contains(text(),'Solu��es')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		driver.findElement(By.xpath("//span[contains(.,'Produtor agr�cola')]")).click();
	
		//ct05.0
	
		driver.getCurrentUrl().equals("https://www.siagri.com.br/segmentos/produtor-agricola");
				
		//ct05.1
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div")).equals("Softwares de gest�o para produtores de gr�os e algod�o");
				
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/h2")).equals("Gest�o do planejamento da safra � contabilidade. Com o Grupo Siagri voc� gerencia seu neg�cio de ponta a ponta, centralizando a gest�o administrativa, financeira, fiscal e operacional.");
			

		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/span")).click();
		
		driver.findElement(By.id("form-close")).click();
		
	
		//ct05.2
		driver.findElement(By.xpath("//span[contains(.,'Planejamento de safra')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Gest�o de estoque (armazenagem)')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de custos')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Padroniza��o de processos')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Gest�o or�ament�ria')]")).isEnabled();
		
		
		//06
		driver.findElement(By.xpath("//a[contains(text(),'Solu��es')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		driver.findElement(By.xpath("//span[contains(.,'Sementeira')]")).click();
	
		//ct06.0
	
		driver.getCurrentUrl().equals("https://www.siagri.com.br/segmentos/sementeira");
				
	
		//ct06.1
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div")).equals("Softwares para gest�o de sementeiras");
				
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/h2")).equals("Ganhe efici�ncia no processo de beneficiamento de sementes. Com as solu��es Siagri, voc� gerencia desde o recebimento do gr�o, at� o embarque de sementes.");

		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/span")).click();
		
		driver.findElement(By.id("form-close")).click();
		
		//ct06.2
		driver.findElement(By.xpath("//span[contains(.,'Gest�o de recebimento, produ��o e expedi��o de sementes')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de lotes')]")).isEnabled();
		driver.findElement(By.xpath("//section[@id='segmentos-vantagens']/div/div[2]/div[3]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Log�stica de embarque')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Gest�o da colheita e armazenagem de gr�os')]")).isEnabled();
		
		driver.close();
	}
	
}
