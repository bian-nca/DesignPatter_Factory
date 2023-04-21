/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.math.BigDecimal;

/**
 *
 * @author Bianca
 */
public class Orcamento {
    public BigDecimal valorOrcamento;
    private String IcmsRegiao;
    
    public Orcamento(BigDecimal valorOrcamento, String IcmsRegiao){
        this.valorOrcamento = valorOrcamento;
        this.IcmsRegiao = IcmsRegiao;
    } 

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    public String getIcmsRegiao() {
        return IcmsRegiao;
    }

    public void setIcmsRegiao(String IcmsRegiao) {
        this.IcmsRegiao = IcmsRegiao;
    }
    
}
