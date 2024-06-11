package telaSwing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class sistema implements ActionListener {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Testando swing");
		JLabel nomeFunc = new JLabel("Nome do funcionário");
		JTextField inputNomeFunc = new JTextField();
		JLabel totalVendas = new JLabel("Total de vendas");
		JTextField inputVendas = new JTextField();
		JLabel comissaoPercent = new JLabel("Porcentagem da comissão:");
		JRadioButton onePercent = new JRadioButton("1%");
		JRadioButton twoPercent = new JRadioButton("2%");
		JRadioButton threePercent = new JRadioButton("3%");
		JRadioButton fourPercent = new JRadioButton("4%");
		ButtonGroup porcentagens = new ButtonGroup();
		
		porcentagens.add(onePercent);
		porcentagens.add(twoPercent);
		porcentagens.add(threePercent);
		porcentagens.add(fourPercent);
		
		JLabel salario = new JLabel("Salário");
		JTextField inputSalario = new JTextField();
		JLabel valorComissao = new JLabel("Valor da comissão");
		JTextField outputComissao = new JTextField();;
		JLabel montante = new JLabel("Salário + Comissão");
		JTextField outputMontante = new JTextField();
		
		JButton calcular = new JButton("Calcular");
		
		janela.setSize(400,600);
		janela.setVisible(true);
		
		JPanel painel = new JPanel();
		janela.add(painel);
		
		painel.setLayout(new GridLayout(9, 2, 10, 10));
		painel.add(nomeFunc);
		painel.add(inputNomeFunc);
		painel.add(totalVendas);
		painel.add(inputVendas);
		painel.add(comissaoPercent);
		painel.add(new JLabel(""));
		painel.add(onePercent);
		painel.add(twoPercent);
		painel.add(threePercent);
		painel.add(fourPercent);
		painel.add(valorComissao);
		painel.add(outputComissao);
		painel.add(salario);
		painel.add(inputSalario);
		painel.add(montante);
		painel.add(outputMontante);
		painel.add(calcular);
		


		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
