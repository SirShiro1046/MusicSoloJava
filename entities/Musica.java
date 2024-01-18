package entities;
public class Musica {
    private String track_id;
    private String track_name;
    private String track_artist;
    private Double track_popularity;
    private String track_album_id;
    private String track_album_name;
    private String track_album_release_date;
    private String playlist_name;
    private String playlist_id;
    private String playlist_genre;
    private String playlist_subgenre;
    private Double danceability;
    private Double energy;
    private Double key;
    private Double loudness;
    private Double mode;
    private Double speechiness;
    private Double acousticness;
    private Double instrumentalness;
    private Double liveness;
    private Double valence;
    private Double tempo;
    private Double duration_ms;
    public Musica(){
        
    }

    public Musica(String track_id, String track_name, String track_artist, Double track_popularity,
            String track_album_id, String track_album_name, String track_album_release_date, String playlist_name,
            String playlist_id, String playlist_genre, String playlist_subgenre, Double danceability, Double energy,
            Double key, Double loudness, Double mode, Double speechiness, Double acousticness, Double instrumentalness,
            Double liveness, Double valence, Double tempo, Double duration_ms) {
        this.track_id = track_id;
        this.track_name = track_name;
        this.track_artist = track_artist;
        this.track_popularity = track_popularity;
        this.track_album_id = track_album_id;
        this.track_album_name = track_album_name;
        this.track_album_release_date = track_album_release_date;
        this.playlist_name = playlist_name;
        this.playlist_id = playlist_id;
        this.playlist_genre = playlist_genre;
        this.playlist_subgenre = playlist_subgenre;
        this.danceability = danceability;
        this.energy = energy;
        this.key = key;
        this.loudness = loudness;
        this.mode = mode;
        this.speechiness = speechiness;
        this.acousticness = acousticness;
        this.instrumentalness = instrumentalness;
        this.liveness = liveness;
        this.valence = valence;
        this.tempo = tempo;
        this.duration_ms = duration_ms;
    }

    public String getTrack_id() {
        return track_id;
    }

    public void setTrack_id(String track_id) {
        this.track_id = track_id;
    }

    public String getTrack_name() {
        return track_name;
    }

    public void setTrack_name(String track_name) {
        this.track_name = track_name;
    }

    public String getTrack_artist() {
        return track_artist;
    }

    public void setTrack_artist(String track_artist) {
        this.track_artist = track_artist;
    }

    public Double getTrack_popularity() {
        return track_popularity;
    }

    public void setTrack_popularity(Double track_popularity) {
        this.track_popularity = track_popularity;
    }

    public String getTrack_album_id() {
        return track_album_id;
    }

    public void setTrack_album_id(String track_album_id) {
        this.track_album_id = track_album_id;
    }

    public String getTrack_album_name() {
        return track_album_name;
    }

    public void setTrack_album_name(String track_album_name) {
        this.track_album_name = track_album_name;
    }

    public String getTrack_album_release_date() {
        return track_album_release_date;
    }

    public void setTrack_album_release_date(String track_album_release_date) {
        this.track_album_release_date = track_album_release_date;
    }

    public String getPlaylist_name() {
        return playlist_name;
    }

    public void setPlaylist_name(String playlist_name) {
        this.playlist_name = playlist_name;
    }

    public String getPlaylist_id() {
        return playlist_id;
    }

    public void setPlaylist_id(String playlist_id) {
        this.playlist_id = playlist_id;
    }

    public String getPlaylist_genre() {
        return playlist_genre;
    }

    public void setPlaylist_genre(String playlist_genre) {
        this.playlist_genre = playlist_genre;
    }

    public String getPlaylist_subgenre() {
        return playlist_subgenre;
    }

    public void setPlaylist_subgenre(String playlist_subgenre) {
        this.playlist_subgenre = playlist_subgenre;
    }

    public Double getDanceability() {
        return danceability;
    }

    public void setDanceability(Double danceability) {
        this.danceability = danceability;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    public Double getKey() {
        return key;
    }

    public void setKey(Double key) {
        this.key = key;
    }

    public Double getLoudness() {
        return loudness;
    }

    public void setLoudness(Double loudness) {
        this.loudness = loudness;
    }

    public Double getMode() {
        return mode;
    }

    public void setMode(Double mode) {
        this.mode = mode;
    }

    public Double getSpeechiness() {
        return speechiness;
    }

    public void setSpeechiness(Double speechiness) {
        this.speechiness = speechiness;
    }

    public Double getAcousticness() {
        return acousticness;
    }

    public void setAcousticness(Double acousticness) {
        this.acousticness = acousticness;
    }

    public Double getInstrumentalness() {
        return instrumentalness;
    }

    public void setInstrumentalness(Double instrumentalness) {
        this.instrumentalness = instrumentalness;
    }

    public Double getLiveness() {
        return liveness;
    }

    public void setLiveness(Double liveness) {
        this.liveness = liveness;
    }

    public Double getValence() {
        return valence;
    }

    public void setValence(Double valence) {
        this.valence = valence;
    }

    public Double getTempo() {
        return tempo;
    }

    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }

    public Double getDuration_ms() {
        return duration_ms;
    }

    public void setDuration_ms(Double duration_ms) {
        this.duration_ms = duration_ms;
    }

    @Override
    public String toString() {
        return "Musica [track_id=" + track_id + ", track_name=" + track_name + ", track_artist=" + track_artist
                + ", track_popularity=" + track_popularity + ", track_album_id=" + track_album_id
                + ", track_album_name=" + track_album_name + ", track_album_release_date=" + track_album_release_date
                + ", playlist_name=" + playlist_name + ", playlist_id=" + playlist_id + ", playlist_genre="
                + playlist_genre + ", playlist_subgenre=" + playlist_subgenre + ", danceability=" + danceability
                + ", energy=" + energy + ", key=" + key + ", loudness=" + loudness + ", mode=" + mode + ", speechiness="
                + speechiness + ", acousticness=" + acousticness + ", instrumentalness=" + instrumentalness
                + ", liveness=" + liveness + ", valence=" + valence + ", tempo=" + tempo + ", duration_ms="
                + duration_ms + "]";
    }

    

    

}
