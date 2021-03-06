/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import java.util.*;
import soot.jimple.parser.analysis.*;

public final class AAndBinop extends PBinop
{
    private TAnd _and_;

    public AAndBinop()
    {
    }

    public AAndBinop(
        TAnd _and_)
    {
        setAnd(_and_);

    }
    public Object clone()
    {
        return new AAndBinop(
            (TAnd) cloneNode(_and_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndBinop(this);
    }

    public TAnd getAnd()
    {
        return _and_;
    }

    public void setAnd(TAnd node)
    {
        if(_and_ != null)
        {
            _and_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _and_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_and_);
    }

    void removeChild(Node child)
    {
        if(_and_ == child)
        {
            _and_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_and_ == oldChild)
        {
            setAnd((TAnd) newChild);
            return;
        }

    }
}
