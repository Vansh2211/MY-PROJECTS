import streamlit as st
import pickle
import pandas as pd


movies_dict = pickle.load(open('movies_dict.pkl','rb'))
movies = pd.DataFrame(movies_dict)

st.title("Movie Recommender System")

option = st.selectbox(
'How would you to be contacted',
('Email','Home phone','Mobile phone'),
 movies['title'].values,efault_index=0)

