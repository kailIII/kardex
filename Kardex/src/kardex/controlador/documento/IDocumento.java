package kardex.controlador.documento;

import javax.swing.JCheckBox;
import javax.swing.JTable;

public interface IDocumento
{
    public void cargar(JTable tblRegistros);
    public void actualizarEst(JTable tblRegistros, JCheckBox chActivar);
    public void menu();
    public void insertar();
    public void modificar(JTable tblRegistros);
    public void eliminar(JTable tblRegistros, JCheckBox chActivar);
    public void activar_desactivar(JTable tblRegistros, JCheckBox chActivar);
}