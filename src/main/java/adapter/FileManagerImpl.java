// Adaptateur
package adapter;

import java.math.BigInteger;

/**
 * Implémentation de FileManager basée sur des utilitaires fournis par FileManagerUtil.
 * Cette classe sert d'adaptateur en offrant des méthodes pour ouvrir, fermer, lire, et écrire des fichiers.
 */
public class FileManagerImpl extends FileManagerUtil implements FileManager {

    /**
     * Ouvre un fichier spécifié.
     *
     * @param files Chemin ou nom du fichier à ouvrir.
     * @return Le nom du fichier s'il est ouvert avec succès, ou un message d'erreur en cas d'échec.
     */
    @Override
    public String open(String files) {
        if (FileManagerUtil.openFile(files)) {
            return files;
        } else {
            return ("Erreur d'ouverture du fichier " + files).trim();
        }
    }

    /**
     * Ferme le fichier actuellement ouvert.
     *
     * @return Message indiquant si la fermeture a été effectuée avec succès ou si une erreur s'est produite.
     */
    @Override
    public String close() {
        if (FileManagerUtil.closeFile()) {
            return ("Fichier fermé avec succès").trim();
        } else {
            return ("Erreur lors de la fermeture du fichier").trim();
        }
    }

    /**
     * Lit des données dans un fichier.
     *
     * @param i Position ou identifiant à partir de laquelle lire.
     * @param b Taille ou type des données à lire.
     * @param c Tableau d'octets qui peut être utilisé pour stocker ou traiter les données.
     * @return Un message indiquant si la lecture a réussi ou si une erreur s'est produite.
     */
    @Override
    public String read(int i, int b, byte[] c) {
        long value = new BigInteger(c).longValue();
        if (FileManagerUtil.readFromFile(i, b)) {
            return "Lecture réussie";
        } else {
            return ("Erreur lors de la lecture du fichier").trim();
        }
    }

    /**
     * Écrit des données dans un fichier.
     *
     * @param i Identifiant ou position où les données doivent être écrites.
     * @param b Taille ou type des données à écrire.
     * @param c Tableau d'octets contenant les données à écrire.
     * @return Un message indiquant si l'écriture a réussi ou si une erreur s'est produite.
     */
    @Override
    public String write(int i, int b, byte[] c) {
        String retour = "";
        long value = new BigInteger(c).longValue();
        if (FileManagerUtil.writeToFile(Integer.toString(i), b, value)) {
            if (value != 0) {
                retour = "Ecriture réussie";
            }
        } else {
            retour = "Erreur lors de l'écriture dans le fichier";
        }
        return retour.trim();
    }
}
