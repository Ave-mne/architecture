package HomeWork3.model.excersize;

import HomeWork3.model.exceptions.ExcersizeFactoryException;

public interface IExcersizeFactory {
    public BaseExcersize create(String excersizeInfo) throws ExcersizeFactoryException;
}