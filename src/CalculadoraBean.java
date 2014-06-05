import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.Calculadora;
import main.DivisaoPorZeroException;

@ManagedBean(name="calculadoraBean")
@SessionScoped
public class Calcula doraBean {
	Calculadora calc; 
	public CalculadoraBean(){
		calc = new Calculadora();	
	}
	
	public String getNumberOne() {
		return numberOne;
		
	}
	public void setNumberOne(String numberOne) {
		this.numberOne = numberOne;
	}
	public String getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(String numberTwo) {
		this.numberTwo = numberTwo;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String numberOne, numberTwo, result;
	
	public String somar(){
		try{
		result = String.valueOf(calc.soma(Double.valueOf(numberOne), Double.valueOf(numberTwo)));
			return "ok";
		} catch(NumberFormatException e){
			result = "Erro no formato";
			return "erroformato";
		}
	}
	
	public String multiplicar(){
		try{
		result = String.valueOf(calc.mult(Double.valueOf(numberOne), Double.valueOf(numberTwo)));
		return "ok";
		} catch(NumberFormatException e){
			result = "Erro no formato";
			return "erroformato";
		}
	}
	
	public String subtrair(){
		try{
		result = String.valueOf(calc.sub(Double.valueOf(numberOne), Double.valueOf(numberTwo)));
		return "ok";
		} catch(NumberFormatException e){
			result = "Erro no formato";
			return "erroformato";
		}
	}
	
	public String dividir(){
		try {
			result = String.valueOf(calc.div(Double.valueOf(numberOne), Double.valueOf(numberTwo)));
			return "ok";
		} catch (DivisaoPorZeroException e) {
			result = "Não pode dividir por zero";
			return "errodivzero";
		} catch(NumberFormatException e){
			result = "Erro no formato";
			return "erroformato";
		}
	}
}
