private Optional<Customer> getByLogin(String login) {
        FindIterable<Document> c = collection.find(eq("login",login));

        if (c.iterator().hasNext())
            return Optional.of(CustomerParser.getCustomer(c.iterator().next()));
        else
            return Optional.empty();
    }