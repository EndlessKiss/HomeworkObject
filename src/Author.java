public class Author {
    private String authorName;
    private String authorLastname;

    public Author(String authorName, String authorLastname) {
        this.authorName = authorName;
        this.authorLastname = authorLastname;
    }

    public String getAuthorName() {

        return authorName;
    }

    public String getAuthorLastname() {

        return authorLastname;
    }

    @Override
    public String toString() {
        return authorName + " " + authorLastname;
   }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author nullName = (Author) other;
        return authorName.equals(nullName.authorName)
        && authorLastname.equals(nullName.authorLastname);

    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName, authorLastname);
    }


}


