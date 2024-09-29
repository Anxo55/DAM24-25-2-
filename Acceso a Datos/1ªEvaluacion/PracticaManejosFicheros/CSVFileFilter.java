package PracticaManejosFicheros;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class CSVFileFilter extends FileFilter {
    @Override
    public boolean accept(File file) {
        // Mostrar directorios y archivos que terminan con .csv
        return file.isDirectory() || file.getName().toLowerCase().endsWith(".csv");
    }

    @Override
    public String getDescription() {
        return "Archivos CSV (*.csv)";
    }
}