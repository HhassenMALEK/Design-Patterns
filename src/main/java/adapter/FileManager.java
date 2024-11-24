package adapter;

/**
 * Interface cible : c'est l'interface que le client utilise.
 * <p>
 * Fournit les méthodes essentielles pour gérer des fichiers, notamment pour les ouvrir, les fermer, lire et écrire des données.
 * </p>
 */
public interface FileManager {

        /**
         * Ouvre un fichier spécifié par son chemin ou nom.
         *
         * @param files Le chemin ou nom du fichier à ouvrir.
         * @return Une chaîne indiquant le succès de l'opération ou un message d'erreur en cas d'échec.
         */
        String open(String files);

        /**
         * Ferme le fichier actuellement ouvert.
         *
         * @return Une chaîne indiquant si la fermeture a réussi ou si une erreur s'est produite.
         */
        String close();

        /**
         * Lit des données dans un fichier.
         *
         * @param i Position ou identifiant à partir duquel commencer la lecture.
         * @param b Taille ou type des données à lire.
         * @param c Tableau d'octets utilisé pour contenir ou traiter les données lues.
         * @return Une chaîne indiquant le résultat de la lecture (succès ou erreur).
         */
        String read(int i, int b, byte[] c);

        /**
         * Écrit des données dans un fichier.
         *
         * @param i Position ou identifiant où les données doivent être écrites.
         * @param b Taille ou type des données à écrire.
         * @param c Tableau d'octets contenant les données à écrire.
         * @return Une chaîne indiquant le résultat de l'écriture (succès ou erreur).
         */
        String write(int i, int b, byte[] c);
}
