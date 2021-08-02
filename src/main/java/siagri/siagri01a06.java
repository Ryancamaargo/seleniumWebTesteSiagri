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
		driver.findElement(By.xpath("//a[contains(text(),'Soluções')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		
		
		
		driver.findElement(By.xpath("//span[contains(.,'Distribuidor de insumos')]")).click();
		
		
		
		
		driver.findElement(By.xpath("//span[contains(.,'Loja agropecuária')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Soluções')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		
		driver.findElement(By.xpath("//span[contains(.,'Armazéns gerais')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Soluções')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		
		driver.findElement(By.xpath("//span[contains(.,'Produtor agrícola')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Soluções')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		
		driver.findElement(By.xpath("//span[contains(.,'Sementeira')]")).click();


		driver.findElement(By.xpath("//a[contains(text(),'Soluções')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		
		driver.findElement(By.xpath("//span[contains(.,'Outros')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Soluções')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
				
		//ct02.0
		driver.getCurrentUrl().equals("https://www.siagri.com.br/segmentos/distribuidor-insumos");
		
		//ct02.1
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div")).equals("Softwares para gestão de distribuidores e revendas de insumos agrícolas");
		
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/p")).equals("Otimize processos, reduza desperdícios e tenha o controle de suas lojas em qualquer hora e lugar. Com o Grupo Siagri, você compra melhor, evita perdas no estoque, vende com mais eficiência e ainda tem mais segurança nas operações de Barter!");
		
		
		driver.findElement(By.cssSelector(".form-open:nth-child(3)")).click();
		
		
		//ct02.2
		driver.findElement(By.id("form-close")).click();
		
		driver.findElement(By.xpath("//span[contains(.,'Estoque eficiente')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Formação de preços')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Gestão de logística (expedição)')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Ampliar mix de atividades (armazenagem, Barter etc)')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Gestão orçamentária')]")).isEnabled();
		
		driver.close();
	
		//Testado e ok
	}
	
	@Test
	public void ct03e04() {
		System.setProperty("webdriver.gecko.driver", caminhoExe);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.siagri.com.br");
		driver.findElement(By.xpath("//a[contains(text(),'Soluções')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		driver.findElement(By.xpath("//span[contains(.,'Loja agropecuária')]")).click();
		
		//ct03.0
		driver.getCurrentUrl().equals("https://www.siagri.com.br/segmentos/loja-agropecuaria");
		
		//ct03.1
		
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div")).equals("Softwares para gestão de lojas e varejo agropecuário");
		
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/h2")).equals("A descrição é igual à ‘Ganhe agilidade em vendas, confiança nos controles de estoque e custos. Fidelize seu cliente e gerencie sua loja agropecuária de forma completa com o software Siagri.");
	
		driver.findElement(By.cssSelector(".form-open:nth-child(5)")).click();
		
		driver.findElement(By.id("form-close")).click();
		

		
		//ct03.2

		driver.findElement(By.xpath("//span[contains(.,'Agilidade no atendimento')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Eficiência operacional')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de comissionamento')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Conformidade fiscal')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Eficiência no fluxo de caixa em dia')]")).isEnabled();
		
		//ct04
		
		driver.findElement(By.xpath("//a[contains(text(),'Soluções')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		driver.findElement(By.xpath("//span[contains(.,'Armazéns gerais')]")).click();
		
		//ct04.0
		driver.getCurrentUrl().equals("https://www.siagri.com.br/segmentos/armazens-gerais");
		
		//ct04.1
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div")).equals("Softwares para gestão de armazéns gerais e cerealistas");
		
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/h2")).equals("Ganhe eficiência desde o recebimento até a expedição dos grãos. Com o Grupo Siagri, você gerencia todos os processos de armazenagem de grãos com agilidade e segurança.");
	
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/span")).click();
		
		driver.findElement(By.id("form-close")).click();
		
	
		
		//ct04.2
		driver.findElement(By.xpath("//span[contains(.,'Gestão de contratos')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de saldos de terceiros')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de retenções e transgenia')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Análise de exposição')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de serviços prestados')]")).isEnabled();
		driver.close();
		
		//Testado e ok
	}
	
	@Test
	public void ct05e06() {
		System.setProperty("webdriver.gecko.driver", caminhoExe);
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.siagri.com.br/segmentos");
		driver.findElement(By.xpath("//a[contains(text(),'Soluções')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		driver.findElement(By.xpath("//span[contains(.,'Produtor agrícola')]")).click();
	
		//ct05.0
	
		driver.getCurrentUrl().equals("https://www.siagri.com.br/segmentos/produtor-agricola");
				
		//ct05.1
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div")).equals("Softwares de gestão para produtores de grãos e algodão");
				
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/h2")).equals("Gestão do planejamento da safra à contabilidade. Com o Grupo Siagri você gerencia seu negócio de ponta a ponta, centralizando a gestão administrativa, financeira, fiscal e operacional.");
			

		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/span")).click();
		
		driver.findElement(By.id("form-close")).click();
		
	
		//ct05.2
		driver.findElement(By.xpath("//span[contains(.,'Planejamento de safra')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Gestão de estoque (armazenagem)')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de custos')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Padronização de processos')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Gestão orçamentária')]")).isEnabled();
		
		
		//06
		driver.findElement(By.xpath("//a[contains(text(),'Soluções')]")).click();
		driver.findElement(By.linkText("Segmentos")).click();
		driver.findElement(By.xpath("//span[contains(.,'Sementeira')]")).click();
	
		//ct06.0
	
		driver.getCurrentUrl().equals("https://www.siagri.com.br/segmentos/sementeira");
				
	
		//ct06.1
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div")).equals("Softwares para gestão de sementeiras");
				
		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/h2")).equals("Ganhe eficiência no processo de beneficiamento de sementes. Com as soluções Siagri, você gerencia desde o recebimento do grão, até o embarque de sementes.");

		driver.findElement(By.xpath("//section[@id='segmentos-titulo']/div/div/span")).click();
		
		driver.findElement(By.id("form-close")).click();
		
		//ct06.2
		driver.findElement(By.xpath("//span[contains(.,'Gestão de recebimento, produção e expedição de sementes')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Controle de lotes')]")).isEnabled();
		driver.findElement(By.xpath("//section[@id='segmentos-vantagens']/div/div[2]/div[3]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Logística de embarque')]")).isEnabled();
		driver.findElement(By.xpath("//span[contains(.,'Gestão da colheita e armazenagem de grãos')]")).isEnabled();
		
		driver.close();
	}
	
}
