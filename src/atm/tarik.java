/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author dhenarraerine
 */
import javax.swing.JOptionPane;
public class tarik {
    private int saldo;
    public void ambil(int tab, int t)
    {
        if(t%100!=0)
        {
            JOptionPane.showMessageDialog(null,"Mesin ATM BRI tidak menerima uang koin \n Silahkan ulangi kembali!","Transaksi Gagal",0);
        }
        else
        {
            if(t>tab)
                JOptionPane.showMessageDialog(null,"Saldo anda tidak mencukupi \n Silahkan lakukan penyetoran","Transaksi Gagal",0);
            else if(t<50000)
                JOptionPane.showMessageDialog(null,"Besaran minimal pengambilan adalah Rp50000","Transaksi Gagal",0);
            else
            {
                saldo =tab-t; JOptionPane.showMessageDialog(null,"saldo anda saat ini sebesar "+saldo);
                if(tab<=50000)
                    saldo =tab-t; JOptionPane.showMessageDialog(null,"saldo minimal harus Rp50000,00 segera lakukan penyetoran untuk menghindari penutupan akun.","CAUTION",2);
            }
                
        }
    }
    public int getsaldo()
    {
        return saldo;
    }
    
}
