package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class PesquisaController {
    
    private Stage stagePesquisa;
    
    RadioButton botaoLinguagensSelecionadas;
    ToggleGroup tgLinguagens = new ToggleGroup();
    ToggleButton botaoSOselecionado;
    ToggleGroup tgSistemaOperacional = new ToggleGroup();
    

    @FXML
    private Button btnSubmeterPesquisa;
    
    @FXML
    private Button btnFecharPesquisa;

    @FXML
    private CheckBox chkGostaProgramar;

    @FXML
    private CheckBox chkProgramaTodosDias;

    @FXML
    private RadioButton rbC;

    @FXML
    private RadioButton rbJava;

    @FXML
    private RadioButton rbPython;

    @FXML
    private ToggleButton tbLinux;

    @FXML
    private ToggleButton tbMac;

    @FXML
    private ToggleButton tbWindows;

    @FXML
    private TextField txtNomeCompleto;

    @FXML
    void onClickBtnSubmeterPesquisa(ActionEvent event) {

        System.out.println("\n\n");
        
        if(!txtNomeCompleto.getText().isEmpty()){       
            System.out.println("Nome completo: " + txtNomeCompleto.getText());
        }
        
        botaoSOselecionado = (ToggleButton) tgSistemaOperacional.getSelectedToggle();
        System.out.print("Sistema Operacional selecionado: ");
        System.out.println(botaoSOselecionado == null ? "Não selecionado" : botaoSOselecionado.getText());
        
        
        botaoLinguagensSelecionadas = (RadioButton) tgLinguagens.getSelectedToggle();
        
        System.out.print("Linguagem de programação preferida: ");
        
            if(botaoLinguagensSelecionadas != null){        
                System.out.println(botaoLinguagensSelecionadas.getText());               
            }else{
                System.out.println("Não selecionado");
            }
       
        System.out.print("Pograma todo dia? ");
        System.out.println(chkProgramaTodosDias.isSelected() == true ? "Sim" : "Nao");
        
        System.out.print("Gosta de programar? ");
        if(chkGostaProgramar.isSelected()){
            System.out.println("Sim");           
        }else{
            System.out.println("Nao");
        }
    }
    
    @FXML
    void OnClickBtnFecharPesquisa(ActionEvent event) {
        
        if(stagePesquisa != null){
            stagePesquisa.close();
        }

    }

    void setStage(Stage novaTela) {
        this.stagePesquisa = novaTela;
    }
    
    void ajustarElmentosJanela(){
        
        tgLinguagens.getToggles().addAll(rbJava, rbPython, rbC);
        tbWindows.setToggleGroup(tgSistemaOperacional);
        tbMac.setToggleGroup(tgSistemaOperacional);
        tbLinux.setToggleGroup(tgSistemaOperacional);
        
    }
 
}
