package org.bill.nullchecks;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import java.util.Set;

import static com.google.common.collect.Iterables.any;
import static com.google.common.collect.Sets.newHashSet;

public class ThingFinder {
    Set<Thing> things;

    public ThingFinder(Thing... things) {
        this.things = newHashSet(things);
    }

    public Thing find(String name, Thing defaultValue) {
        HaveName haveName = new HaveName(name);
        if (any(things, haveName)) {
            return Iterables.find(things, haveName);
        }
        return defaultValue;
    }

    public Thing find(String name) {
        return find(name, Thing.Null);
    }

    // Someday java will have lambdas...
    // Until then we are stuck with...
    private static class HaveName implements Predicate<Thing> {
        private final String name;

        public HaveName(String name) {
            this.name = name;
        }

        public boolean apply(Thing thing) {
            return thing.hasName(name);
        }
    }
}
