import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testplan {
	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		ChromeDriver driver= new ChromeDriver(op);
		driver.get("https://www.amazon.in/stores/page/AFC2489D-5988-433A-824D-84FD4D4AC63B/?_encoding=UTF8&pd_rd_plhdr=t&pd_rd_i=B0CJRQ99J3&ref_=sbx_be_s_sparkle_ssd_bkg&store_ref=SBV_A04966523V75XGJTQEX7A-A0816428TJ48KMJB4ZOZ&lp_asins=B0CJRQ99J3%2CB0CGHSVGDX%2CB0CJRQYZB5&pd_rd_w=vcWlY&content-id=amzn1.sym.df9fe057-524b-4172-ac34-9a1b3c4e647d%3Aamzn1.sym.df9fe057-524b-4172-ac34-9a1b3c4e647d&pf_rd_p=df9fe057-524b-4172-ac34-9a1b3c4e647d&pf_rd_r=VN1FHSCX17SCTFCVF6TE&pd_rd_wg=c5ec2&pd_rd_r=5ab9600d-abdc-4694-a1d8-ede6920616e3");
	}

}
