/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatterFactory;

/**
 *
 * @author Bianca
 */
public class IcmsFactory {
    public CalculoPorRegiao getIcmsPorEstado(String nomeEstado) {
     if (nomeEstado.equalsIgnoreCase("ICMS_MG")) {   
         return new icmsMG();
      } else if (nomeEstado.equalsIgnoreCase("ICMS_SP")) {
          return new icmsSP();
    } else if (nomeEstado.equalsIgnoreCase("ICMS_BA")) {
           return new icmsBA();
    } else if (nomeEstado.equalsIgnoreCase("ICMS_AC")) {
           return new icmsAC();
    } else if (nomeEstado.equalsIgnoreCase("ICMS_ro")) {
           return new icmsRO();
    }else {
          System.out.println("Valor inválido - ICMS não cadastrado");
          return null;
      }
    }
}
