
public class Funcionario {
	
        String Nome;
		double SalarioBruto, Imposto, Aumento;
		
		public double salarioLiquido() {
			
			return SalarioBruto - Imposto ;

		}
		double aumentaSalario() {
			
			return SalarioBruto - Imposto + Aumento; 
		}
}