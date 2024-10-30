
import java.io.File;

public class RenombrarDirectorios {
    public void RenombrarDirectorios(String path){
        // VALIDEMOS QUE EL PATH SEA UN DIRECTORIO
        File directorio = new File(path);
        if (!directorio.exists() || !directorio.isDirectory()){
            System.out.println("LA RUTA PATH NO ES UN DIRECTORIO VALIDO");
            return;
        }
        // ACA VAMOS A CAMBIAR LOS NOMBRES
        //System.out.println("LA RUTA PATH ES VALIDA");
        renombrarDirectoriosInternos(directorio);
    }
    public void renombrarDirectoriosInternos(File directorio){
        // LISTAR TODOS LOS ARCHIVOS Y/O CAROETAS HIJAS
        File [] directoriosArchivodInternos = directorio.listFiles();
        if( directoriosArchivodInternos == null){
            return;
        }
        for (File directorioArchivo :directoriosArchivodInternos){
            if ( directorioArchivo.isDirectory()){// SI ES CARPETA CAMBIO EL NOMBRE
                String nombreOriginal = directorioArchivo.getName();
                String nombreNuevo = "Nuevo_" + nombreOriginal;
                File nuevoDirectorio = new File(directorioArchivo.getParent(), nombreNuevo);
                if (directorioArchivo.renameTo(nuevoDirectorio));
                renombrarDirectoriosInternos(nuevoDirectorio);

            }
        }
    }
    
}
