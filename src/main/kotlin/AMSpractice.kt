
import javax.swing.JOptionPane


fun main(){
    val dialogButton = JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.YES_NO_OPTION)

    if (dialogButton == JOptionPane.YES_OPTION) {
        System.exit(0)
    } else {
        println(dialogButton)
    }

}
