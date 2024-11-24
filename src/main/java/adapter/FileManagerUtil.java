// Classe adaptée
package adapter;

import java.io.RandomAccessFile;

/**
 * Classe utilitaire pour gérer des fichiers.
 * Cette classe représente une structure existante devant être adaptée.
 * Elle utilise des méthodes retournant des booléens pour indiquer le succès ou l'échec des opérations.
 */
public class FileManagerUtil {
    private RandomAccessFile f;

    /**
     * Constructeur protégé pour empêcher l'instanciation directe.
     */
    protected FileManagerUtil() {
    }

    /**
     * Récupère l'objet {@link RandomAccessFile} actuellement utilisé.
     *
     * @return L'instance actuelle de {@link RandomAccessFile}, ou {@code null} si aucun fichier n'est ouvert.
     */
    public RandomAccessFile getF() {
        return f;
    }

    /**
     * Ouvre un fichier spécifié par son chemin ou nom.
     *
     * @param files Le chemin ou le nom du fichier à ouvrir.
     * @return {@code true} si le fichier a été ouvert avec succès, {@code false} sinon.
     */
    public static boolean openFile(String files) {
        if (FileManagerUtil.openFile(files)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Ferme le fichier actuellement ouvert.
     *
     * @return {@code true} si le fichier a été fermé avec succès, {@code false} sinon.
     */
    public static boolean closeFile() {
        return FileManagerUtil.closeFile();
    }

    /**
     * Écrit des données dans un fichier à partir d'un identifiant, d'une position et d'une valeur.
     *
     * @param f   Nom ou identifiant du fichier.
     * @param l   Position ou taille de l'opération.
     * @param l2  Valeur ou données à écrire.
     * @return {@code true} si l'écriture a réussi, {@code false} sinon.
     */
    public static boolean writeToFile(String f, long l, long l2) {
        if (FileManagerUtil.writeToFile(f, l, l2)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Lit des données dans un fichier à partir d'une position et d'une taille spécifiées.
     *
     * @param l   Position ou identifiant à partir duquel commencer la lecture.
     * @param l2  Taille ou limite des données à lire.
     * @return {@code true} si la lecture a réussi, {@code false} sinon.
     */
    public static boolean readFromFile(long l, long l2) {
        return FileManagerUtil.readFromFile(l, l2);
    }
}
