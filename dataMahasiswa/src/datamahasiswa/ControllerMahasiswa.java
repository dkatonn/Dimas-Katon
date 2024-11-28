/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package datamahasiswa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ControllerMahasiswa {
    ArrayList<ModelMahasiswa> ArrayData;
    DefaultTableModel tabellist;
    
    public ControllerMahasiswa(){
        ArrayData = new ArrayList<ModelMahasiswa>();
    }
    public void InsertData(String npm, String nama, int tinggi, boolean pindahan){
        ModelMahasiswa mhs = new ModelMahasiswa(npm, nama, tinggi, pindahan);
        ArrayData.add(mhs);
    }
}
