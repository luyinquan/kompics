/*
 * This file is part of the Kompics component model runtime.
 *
 * Copyright (C) 2009 Swedish Institute of Computer Science (SICS) 
 * Copyright (C) 2009 Royal Institute of Technology (KTH)
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package se.sics.kompics.network;

import se.sics.kompics.KompicsEvent;

/**
 *
 * @author Lars Kroll {@literal <lkroll@kth.se>}
 */
public class ConnectionStatus implements KompicsEvent {

    public static enum State {

        REQUESTED,
        ESTABLISHED,
        DROPPED;
    }

    public final State state;
    public final Address peer;
    public final Transport protocol;

    private ConnectionStatus(State state, Address peer, Transport protocol) {
        this.state = state;
        this.peer = peer;
        this.protocol = protocol;
    }

    public static ConnectionStatus requested(Address peer, Transport protocol) {
        return new ConnectionStatus(State.REQUESTED, peer, protocol);
    }

    public static ConnectionStatus established(Address peer, Transport protocol) {
        return new ConnectionStatus(State.ESTABLISHED, peer, protocol);
    }

    public static ConnectionStatus dropped(Address peer, Transport protocol) {
        return new ConnectionStatus(State.DROPPED, peer, protocol);
    }
}